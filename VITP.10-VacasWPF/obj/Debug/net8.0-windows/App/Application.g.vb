﻿#ExternalChecksum("..\..\..\..\App\Application.xaml","{ff1816ec-aa5e-4d10-87f7-6f4963833460}","FFD7F7837F9DE652D5D4CC3B0B42137707F788CE")
'------------------------------------------------------------------------------
' <auto-generated>
'     Este código fue generado por una herramienta.
'     Versión de runtime:4.0.30319.42000
'
'     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
'     se vuelve a generar el código.
' </auto-generated>
'------------------------------------------------------------------------------

Option Strict Off
Option Explicit On

Imports System
Imports System.Diagnostics
Imports System.Windows
Imports System.Windows.Automation
Imports System.Windows.Controls
Imports System.Windows.Controls.Primitives
Imports System.Windows.Controls.Ribbon
Imports System.Windows.Data
Imports System.Windows.Documents
Imports System.Windows.Ink
Imports System.Windows.Input
Imports System.Windows.Markup
Imports System.Windows.Media
Imports System.Windows.Media.Animation
Imports System.Windows.Media.Effects
Imports System.Windows.Media.Imaging
Imports System.Windows.Media.Media3D
Imports System.Windows.Media.TextFormatting
Imports System.Windows.Navigation
Imports System.Windows.Shapes
Imports System.Windows.Shell
Imports VITP._10_VacasWPF

Namespace app
    
    '''<summary>
    '''Application
    '''</summary>
    <Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>  _
    Partial Public Class Application
        Inherits System.Windows.Application
        Implements System.Windows.Markup.IComponentConnector
        
        Private _contentLoaded As Boolean
        
        '''<summary>
        '''InitializeComponent
        '''</summary>
        <System.Diagnostics.DebuggerNonUserCodeAttribute(),  _
         System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "8.0.1.0")>  _
        Public Sub InitializeComponent()
            
            #ExternalSource("..\..\..\..\App\Application.xaml",5)
            Me.StartupUri = New System.Uri("ui.mainWindow.MainWindow.xaml", System.UriKind.Relative)
            
            #End ExternalSource
            If _contentLoaded Then
                Return
            End If
            _contentLoaded = true
            Dim resourceLocater As System.Uri = New System.Uri("/VITP.10-VacasWPF;component/app/application.xaml", System.UriKind.Relative)
            
            #ExternalSource("..\..\..\..\App\Application.xaml",1)
            System.Windows.Application.LoadComponent(Me, resourceLocater)
            
            #End ExternalSource
        End Sub
        
        <System.Diagnostics.DebuggerNonUserCodeAttribute(),  _
         System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "8.0.1.0"),  _
         System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never),  _
         System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes"),  _
         System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity"),  _
         System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")>  _
        Sub System_Windows_Markup_IComponentConnector_Connect(ByVal connectionId As Integer, ByVal target As Object) Implements System.Windows.Markup.IComponentConnector.Connect
            Me._contentLoaded = true
        End Sub
    End Class
End Namespace

